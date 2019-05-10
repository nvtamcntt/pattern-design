
// y nghia 
// mot dau vao nhung thuc hien nhieu dau ra khac nhau

public interface Command<T>{
    boolean excute(T context)
}

public class FirstCommand implements Command<Map<String, Object>>{
    public boolean execute(Map<String, Object> context) {
        // to do some thing
    }
}

public class SecondCommand implements Command<Map<String, Object>>{
    public boolean excute(Map<String, Object> context){
        // to do some thing
    }
}

public class Chain {
    public List<Command> commands

    public Chain(Command... commands){
        this.commands = Arrays.asList(commands)
    }

    public void start(Object context){
        for(Command command : commands){
            boolean shoudStop = command.excute(context)

            if (shoudStop) return
        }
    }
}

Chain chain = new Chain(new FirstCommand(), new SecondCommand())
Map<String, Object> context = new HashMap<>()
context.put("some parameter", some value)
chain.start(context)