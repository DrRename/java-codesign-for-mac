package io.github.javacodesign;

import java.util.List;

public class LinuxJPackager extends JPackager {

    private String linuxMenuGroup;

    protected List<String> buildJPackagerCommand() {
        List<String> command = super.buildJPackagerCommand();
        command.add("--type");
        command.add("app-image");
        command.add("--linux-shortcut");
        if(linuxMenuGroup != null && !linuxMenuGroup.isEmpty()){
            command.add("--linux-menu-group");
            command.add(linuxMenuGroup);
        }
        return command;
    }

    public String getLinuxMenuGroup() {
        return linuxMenuGroup;
    }

    public LinuxJPackager setLinuxMenuGroup(String linuxMenuGroup) {
        this.linuxMenuGroup = linuxMenuGroup;
        return this;
    }
}
