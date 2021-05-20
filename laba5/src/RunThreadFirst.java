public class RunThreadFirst {

    Syncronizer namesSynchro;

    public RunThreadFirst(Syncronizer namesSynchro)
    {
        this.namesSynchro = namesSynchro;
    }

    private void readOnConsole() throws ObjectException {
        while (namesSynchro.canRead())
            namesSynchro.readFromConsole();
    }

    @Override
    public void run() {
        try {
            readOnConsole();
        } catch (ObjectException e) {
            e.printObjectException();
        }
    }


}
