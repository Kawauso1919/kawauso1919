/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.model.data;

/**
 * ゲーム内の各種固定設定の管理。<br>
 * TODO リソースバンドルとかで管理かな・・。
 *
 * @author t-sato
 */
public class GameConstant {

    public static int CELL_SIZE() {
        return 24;
    }

    public static String TITLE() {
        return "Fire Emblem";
    }
}
