WITH RANKED AS (
    SELECT
        ID,

        -- 크기가 큰 순서대로 순번 부여
        ROW_NUMBER() OVER (
            ORDER BY SIZE_OF_COLONY DESC
        ) AS RN,

        -- 전체 대장균 개체 수
        COUNT(*) OVER () AS TOTAL_COUNT

    FROM ECOLI_DATA
)

SELECT
    ID,
    CASE
        WHEN RN <= TOTAL_COUNT * 25 / 100 THEN 'CRITICAL'
        WHEN RN <= TOTAL_COUNT * 50 / 100 THEN 'HIGH'
        WHEN RN <= TOTAL_COUNT * 75 / 100 THEN 'MEDIUM'
        ELSE 'LOW'
    END AS COLONY_NAME

FROM RANKED
ORDER BY ID;