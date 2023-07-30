package wantedpreonboarding.demo.domain.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@NoArgsConstructor
@Table(name="tb_board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="board_id", nullable = false)
    private Integer boardId;

    @Column(name="board_title", nullable = false)
    private String boardTitle;

    @Column(name="board_content")
    private String boardContent;



}
