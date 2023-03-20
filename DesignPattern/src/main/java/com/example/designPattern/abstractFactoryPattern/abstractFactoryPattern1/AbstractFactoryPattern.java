package com.example.designPattern.abstractFactoryPattern.abstractFactoryPattern1;

public class AbstractFactoryPattern {
        public static void main(String[] args) {

            AbstractFactory NoteBookFactory = FactoryProducer.getFactory(false);

            NoteBook NoteBook1 = NoteBookFactory.getNoteBook("Classmate");
            NoteBook1.sales();

            NoteBook NoteBook2 = NoteBookFactory.getNoteBook("Navneet");
            NoteBook2.sales();

            AbstractFactory NoteBookFactory1 = FactoryProducer.getFactory(true);

            NoteBook NoteBook3 = NoteBookFactory1.getNoteBook("Classmate");
            NoteBook3.sales();

            NoteBook NoteBook4 = NoteBookFactory1.getNoteBook("Navneet");
            NoteBook4.sales();

        }

}
