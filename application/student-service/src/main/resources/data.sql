INSERT INTO student (id, first_name, last_name, email)
values (1, 'Bob', 'de Bouwer', 'bob.debouwer@mail.com'),
       (2, 'Bobien', 'de Brouwer', 'bobien.debrouwer@mail.com'),
       (3, 'Hannah', 'Smits', 'hannah.smits@mail.com'),
       (4, 'Jaque', 'Fransman', 'jaque.fransman@mail.com');

insert into student_course (id, course_id, student_id)
values (1, 'd99072ed-a6e4-4a43-a730-2077393abdfc', 1),
       (2, 'd99072ed-a6e4-4a43-a730-2077393abdfc', 3),
       (3, '81ae5ba6-7323-4381-b5e9-95579c1a514f', 1),
       (4, '81ae5ba6-7323-4381-b5e9-95579c1a514f', 3),
       (5, '7f32aa0c-4753-4be0-b73e-6a558de66220', 1),
       (6, '7f32aa0c-4753-4be0-b73e-6a558de66220', 3),
       (7, '2d2f0685-7e51-4a35-93a6-2f345623497d', 2),
       (8, '2d2f0685-7e51-4a35-93a6-2f345623497d', 4),
       (9, '4353bf05-b2d3-45e6-9453-79489ab8edde', 2),
       (10, '4353bf05-b2d3-45e6-9453-79489ab8edde', 4);
