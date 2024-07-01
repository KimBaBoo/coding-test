SELECT gb.title, gb.board_id, gr.reply_id, gr.writer_id, gr.contents, TO_CHAR(gr.created_date, 'yyyy-MM-dd')
FROM used_goods_board gb, used_goods_reply gr
WHERE gb.board_id = gr.board_id
  AND TO_CHAR(gb.created_date, 'yyyy-MM') = '2022-10'
ORDER BY gr.created_date ASC, gb.title ASC;