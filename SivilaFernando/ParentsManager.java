public class ParentsManager {
    // Fields:
    Parent[] myParents;
    int parentsCount;

    // Constructor:
    ParentsManager() {
        parentsCount = 0;
        myParents = new Parent[500];
    }

    // Methods:
    void addParent(Parent parent) {
        myParents[parentsCount] = parent;
        parentsCount++;
    }

    Parent searchParent(String searchName) {
        for (int i = 0; i < parentsCount; i++) {
            if (myParents[i].name.equals(searchName)) {
                return myParents[i];
            }
        }
        return null;
    }
}


