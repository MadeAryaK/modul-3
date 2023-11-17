public class App {
    public static void main(String[] args) throws Exception {
        list baru = new list();

        baru.addlast("Demon Hunter Sword", 8, 2180);
        baru.addlast("Sea Halberd", 6, 1950);
        baru.addlast("Mafelic Roar", 3,2060);
        baru.addlast("haas's Claw", 19, 0);
        baru.addlast("Berseker's Furry", 3, 0);
        baru.addlast("Endless Battle", 4, 0);
        baru.addlast("Windtalker", 12, 0);
        baru.addlast("Scarlet Phantom", 16, 0);
        baru.addlast("Blade of Despair", 23, 0);
        baru.addlast("Hunter Strike", 15, 0);
        baru.addlast("Bloodlust Axe", 9, 0);
        baru.addlast("Rose Gold Meteor", 17, 0);
        baru.addlast("Golden Staff", 27, 0);
        baru.addlast("Wind of Nature", 25, 0);
        baru.display();

        System.out.println();
        System.out.println("setelah diurutkan");
        System.out.println();

        baru.bubblesort();
        baru.display();


        list mage = new list();
        mage.addlast("Enchanted Talisman", 9, 1870);
        mage.addlast("Divine Glaive", 11, 1970);
        mage.addlast("Winter Truncheon", 14, 1910);
        mage.addlast("Feather of Heaven", 1, 2030);
        mage.addlast("Holy Crystal", 0, 2180);
        mage.addlast("Genius Wand", 6, 2000);
        mage.addlast("Necklace of Durance", 10, 2110);
        mage.addlast("Concentrated Energy", 12, 2020);
        mage.addlast("Ice Queen Wand", 18, 2240);
        mage.addlast("Glowing Wand", 16, 2120);
        mage.addlast("Calamity Reaper", 15, 1950);
        mage.addlast("Clock of Destiny", 19, 1950);
        mage.addlast("Blood Wings", 20, 3000);
        mage.addlast("Fleeting Time", 21, 2050);
        mage.addlast("Lightning Truncheon", 17, 2250);
        // mage.display();
        // System.out.println();
        // System.out.println("setelah diurutkan");
        // System.out.println();
    }
}
