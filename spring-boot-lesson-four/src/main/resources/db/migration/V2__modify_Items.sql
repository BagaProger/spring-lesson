ALTER  Table items add column cost Int;

Update items SET  cost = id *20;