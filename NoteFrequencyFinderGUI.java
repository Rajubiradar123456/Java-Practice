// NoteFrequencyFinder with a basic frontend using JFrame
// Only uses basic Java Swing - easy for beginners

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NoteFrequencyFinderGUI extends JFrame implements ActionListener {
    JTextField noteField, octaveField;
    JTextArea resultArea;
    JButton findButton;

    public NoteFrequencyFinderGUI() {
        setTitle("Note Frequency Finder 🎶");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel noteLabel = new JLabel("Enter Note (e.g., C, D#, Bb):");
        noteField = new JTextField(10);

        JLabel octaveLabel = new JLabel("Enter Octave (e.g., 4):");
        octaveField = new JTextField(5);

        findButton = new JButton("Find Frequency");
        findButton.addActionListener(this);

        resultArea = new JTextArea(8, 30);
        resultArea.setEditable(false);

        add(noteLabel);
        add(noteField);
        add(octaveLabel);
        add(octaveField);
        add(findButton);
        add(new JScrollPane(resultArea));

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String note = noteField.getText().toUpperCase();
        int octave;
        try {
            octave = Integer.parseInt(octaveField.getText());
        } catch (NumberFormatException ex) {
            resultArea.setText("Please enter a valid octave number.");
            return;
        }

        double baseFrequency = 0;
        switch (note) {
            case "C": baseFrequency = 261.63; break;
            case "C#": case "DB": baseFrequency = 277.18; break;
            case "D": baseFrequency = 293.66; break;
            case "D#": case "EB": baseFrequency = 311.13; break;
            case "E": baseFrequency = 329.63; break;
            case "F": baseFrequency = 349.23; break;
            case "F#": case "GB": baseFrequency = 369.99; break;
            case "G": baseFrequency = 392.00; break;
            case "G#": case "AB": baseFrequency = 415.30; break;
            case "A": baseFrequency = 440.00; break;
            case "A#": case "BB": baseFrequency = 466.16; break;
            case "B": baseFrequency = 493.88; break;
            default:
                resultArea.setText("Invalid note entered.");
                return;
        }

        int diff = octave - 4;
        if (diff > 0) {
            for (int i = 0; i < diff; i++) baseFrequency *= 2;
        } else if (diff < 0) {
            for (int i = 0; i < -diff; i++) baseFrequency /= 2;
        }

        String sargam = getSargamEquivalent(note);
        resultArea.setText("🎵 Note: " + note + octave + "\n" +
                           "📡 Frequency: " + String.format("%.2f", baseFrequency) + " Hz\n" +
                           "🎶 Sargam: " + sargam + "\n" +
                           "Tip: Hum and match this note for ear training!");
    }

    public String getSargamEquivalent(String note) {
        switch (note) {
            case "C": case "B#": return "Sa";
            case "C#": case "DB": return "Re (Komal)";
            case "D": return "Re";
            case "D#": case "EB": return "Ga (Komal)";
            case "E": return "Ga";
            case "F": return "Ma";
            case "F#": case "GB": return "Ma (Tivra)";
            case "G": return "Pa";
            case "G#": case "AB": return "Dha (Komal)";
            case "A": return "Dha";
            case "A#": case "BB": return "Ni (Komal)";
            case "B": return "Ni";
            default: return "Unknown";
        }
    }

    public static void main(String[] args) {
        new NoteFrequencyFinderGUI();
    }
}