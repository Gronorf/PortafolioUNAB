package unab.portafolio.controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unab.portafolio.dao.DAOException;
import unab.portafolio.model.paciente.Paciente;
import unab.portafolio.model.paciente.PacienteDAO;
import java.io.ByteArrayOutputStream;
import java.util.List;

import static unab.portafolio.controller.ReporteController.atencionPacientes;

@RestController
@RequestMapping("/api/report")
public class ReportController {


    @GetMapping("/pdf")
    public ResponseEntity<byte[]> generatePDF() throws DocumentException, DAOException {

        PacienteDAO pacienteDAO = new PacienteDAO();

        List<Paciente> pacientes = pacienteDAO.Reporte("ingresoPaciente", atencionPacientes); // Obtén la lista de pacientes desde tu servicio

        // Genera el PDF utilizando una librería adecuada, por ejemplo, iText o Flying Saucer
        byte[] pdfBytes = generatePDFBytes(pacientes);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("attachment", "report.pdf");
        headers.setContentLength(pdfBytes.length);

        return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
    }

    private byte[] generatePDFBytes(List<Paciente> pacientes) throws DocumentException {
        // Lógica para generar el PDF con los datos de la lista de pacientes
        // Utiliza una librería como iText o Flying Saucer para generar el PDF

        // Aquí tienes un ejemplo básico utilizando iText
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, outputStream);

        document.open();

        // Agrega los datos de la tabla al PDF
        PdfPTable table = new PdfPTable(7);
        table.addCell("N°");
        table.addCell("Rut");
        table.addCell("Ficha Clinica");
        table.addCell("Nombre");
        table.addCell("Apellido Paterno");
        table.addCell("Apellido Materno");
        table.addCell("Fecha Ingreso");

        for (Paciente paciente : pacientes) {
            table.addCell(String.valueOf(paciente.getIdPaciente()));
            table.addCell(String.valueOf(paciente.getRutPaciente()));
            table.addCell(String.valueOf(paciente.getFichaClinica()));
            table.addCell(paciente.getNombrePaciente());
            table.addCell(paciente.getApellidoPaternoPaciente());
            table.addCell(paciente.getApellidoMaternoPaciente());
            table.addCell(String.valueOf(paciente.getIngresoPaciente()));
        }

        document.add(table);

        document.close();
        writer.close();

        return outputStream.toByteArray();
    }
}
