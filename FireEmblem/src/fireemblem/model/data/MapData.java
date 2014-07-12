/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.model.data;

/**
 *
 * @author t-sato
 */
public class MapData {

    public Cell[][] cells;
    public Range[][] moveRanges;
    public Range[][] effectRanges;

    public MapData() {
        cells = new Cell[19][25];
        moveRanges = new Range[19][25];
        effectRanges = new Range[19][25];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 25; j++) {
                cells[i][j] = new Cell(j, i, CellType.平地);
                moveRanges[i][j] = new Range(j, i);
                effectRanges[i][j] = new Range(j, i);
            }
        }
    }
}
