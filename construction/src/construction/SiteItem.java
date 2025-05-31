/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package construction;

/**
 *
 * @author Zaki
 */
public class SiteItem {
    final int siteId;
    private final String siteName;

    public SiteItem(int siteId, String siteName) {
        this.siteId = siteId;
        this.siteName = siteName;
    }

    public int getSiteId() {
        return siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    @Override
    public String toString() {
        return siteName; // This tells the combo box what to display
    } 
}
