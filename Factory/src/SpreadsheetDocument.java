
    public class SpreadsheetDocument implements Document {
        @Override
        public void open() {
            System.out.println("Abriendo hoja de cálculo...");
        }

        @Override
        public void save() {
            System.out.println("Guardando hoja de cálculo...");
        }

        @Override
        public void close() {
            System.out.println("Cerrando hoja de cálculo...");
        }
    }

