package com.example.designPattern.abstractFactoryPattern.abstractFactoryPattern1;


class FactoryProducer {
    public static AbstractFactory getFactory(boolean note){
        if(note){
            return new SprialNoteBookFactory();
        }else{
            return new NoteBookFactory();
        }
    }
}
