    package com.app.marcos.api.Repositories;

    import org.springframework.data.jpa.repository.JpaRepository;
    import com.app.marcos.api.Model.Moto;
    import java.util.List;

    public interface MotoRepository extends JpaRepository<Moto, Long> {
        List<Moto> findBymarca(String marca);
    }

