public class RunThreadSecond {
    Syncronizer namesSynchro;
    public RunThreadSecond(Syncronizer namesSynchro){
        this.namesSynchro = namesSynchro;
    }

    private void writeToConsole() throws ObjectException {

        while (Syncronizer.canWrite())
        {
            Syncronizer.writeToConsole(new Random().nextInt(2));
        }


    }
    @Override
    public void run() {
        try {
            writeToConsole();
        } catch (ObjectException e) {
            e.ObjectException();
        }
    }
}
