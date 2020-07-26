import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class Main {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);

            int noOfData = Integer.parseInt(line);
            Map<String, Node> map = new HashMap<String,Node>();
            for(int i = 0 ; i < noOfData ; i++){
                String[] arrCity =  in.readLine().split(",");
                Node from  = map.getOrDefault(arrCity[0],new Node(arrCity[0]));
                Node to  = map.getOrDefault(arrCity[1],new Node(arrCity[1]));

                from.getDestinations().add(to);
                to.getDestinations().add(from);

                map.put(arrCity[0],from);
                map.put(arrCity[1],to);
            }



            String[] arrCity =  in.readLine().split(",");
            Node from  = map.get(arrCity[0]);
            Node to  = map.get(arrCity[1]);
            if(from ==null || to ==null){
                System.out.println(false);
            }else{
                boolean found = false;


            }

            Set<String> visited = new HashSet<>();
            System.out.println(findDestination(from , to , noOfData,visited)  );;

        }
    }

    public static boolean findDestination(Node from , Node to , int maxLength, Set<String> visited ){
        // DFS till maxLingth
        List<Node> destinations = from.getDestinations();
        visited.add(from.getCity());
        if(maxLength>0){
            for(Node node :  destinations){
                if(visited.contains(node.getCity()))
                    continue;
                if(node.getCity().equalsIgnoreCase(to.getCity())){
                    return true;
                }else{
                    return findDestination(node , to , maxLength-1, visited);
                }

            }

        }
        return false;
    }
}

class Node{
    private String city;
    private List<Node> destinations ;

    public Node(String data){
        this.city = data;
        this.destinations = new ArrayList<>();
    }

    public List<Node> getDestinations(){
        return destinations;
    }

    public String getCity(){
        return city;
    }

}