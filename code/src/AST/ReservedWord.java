package AST;
public class ReservedWord  {
    //AngularCore| Angular| Component| RouterOutlet| CommonModule| Input| OnInit|Click
    String AngularCore;
    String Angular;
    String Component;
    String RouterOutlet;
    String CommonModule;
    String Input;
    String OnInit;
    String Click;

    public String getAngularCore() {
        return AngularCore;
    }

    public void setAngularCore(String angularCore) {
        AngularCore = angularCore;
    }

    public String getAngular() {
        return Angular;
    }

    public void setAngular(String angular) {
        Angular = angular;
    }

    public String getComponent() {
        return Component;
    }

    public void setComponent(String component) {
        Component = component;
    }

    public String getRouterOutlet() {
        return RouterOutlet;
    }

    public void setRouterOutlet(String routerOutlet) {
        RouterOutlet = routerOutlet;
    }

    public String getCommonModule() {
        return CommonModule;
    }

    public void setCommonModule(String commonModule) {
        CommonModule = commonModule;
    }

    public String getInput() {
        return Input;
    }

    public void setInput(String input) {
        Input = input;
    }

    public String getOnInit() {
        return OnInit;
    }

    public void setOnInit(String onInit) {
        OnInit = onInit;
    }

    public String getClick() {
        return Click;
    }

    public void setClick(String click) {
        Click = click;
    }

    @Override
    public String toString() {
        if(AngularCore!=null){
            return AngularCore;
        }
        else if(Angular !=null){
            return Angular;
        }
        else if(Component!=null){
            return Component;
        }
        else if(RouterOutlet!=null){
            return  RouterOutlet;
        }
        else if(CommonModule !=null){
            return CommonModule;
        }
        else if(Input!=null){
            return Input;
        }
        else if(OnInit!=null){
            return OnInit;
        }
        return Click;
    }
}