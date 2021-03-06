package org.huangyr.project.vulcan.runner.common;

/*******************************************************************************
 *
 * @date 2019-12-18 12:12 PM 
 * @author: <a href=mailto:huangyueran>黄跃然</a>
 * @Description: Runner启动指令
 ******************************************************************************/
public enum StartupOption {

    //  正常启动
    START("-start"),
    // 更新
    UPGRADE("-upgrade");

    private String name = null;

    StartupOption(String name) {
        this.name = name;
    }

    public static StartupOption parseArguments(String[] args) {
        int argsLen = (args == null) ? 0 : args.length;
        StartupOption defaultStartupOption = StartupOption.START;
        for (int i = 0; i < argsLen; i++) {
            String cmd = args[i];
            StartupOption startupOption = getByValue(cmd);
            return startupOption;
        }
        return defaultStartupOption;
    }

    public String getName() {
        return name;
    }

    public static StartupOption getByValue(String args) {
        for (StartupOption startupOption : values()) {
            if (startupOption.getName().equals(args)) {
                return startupOption;
            }
        }
        return null;
    }

}
