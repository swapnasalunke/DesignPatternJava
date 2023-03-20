package com.example.designPattern.abstractFactoryPattern.abstractFactoryPattern1;

class SprialNoteBookFactory extends AbstractFactory {
    @Override
    public NoteBook getNoteBook(String NoteBookType){
        if  (NoteBookType.equalsIgnoreCase("Classmate")){
            return new Classmate();
        }   else if(NoteBookType.equalsIgnoreCase("Navneet")){
            return new Navneet();
        }
        return null;
    }
}
