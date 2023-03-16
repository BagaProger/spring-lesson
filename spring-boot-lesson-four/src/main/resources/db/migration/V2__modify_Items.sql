<<<<<<< HEAD
Insert Into products(title,description,price)
values
    ('Galaxy Z','New tech',2500),
    ('Galaxy S','Latest model of galaxy',2000),
    ('Galaxy Note','More size - more cost',1500),
    ('Wireless charger','Free hands',500);
=======
ALTER  Table items add column cost Int;

Update items SET  cost = id *20;
>>>>>>> origin/master
