package dto;

import entity.util.ItemType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private Long id;
    private ItemType type;
    private String name;
    private double startingPrice;
    private String img;
}
