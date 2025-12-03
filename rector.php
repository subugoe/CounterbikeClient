<?php

declare(strict_types=1);

use Rector\Config\RectorConfig;
use Rector\Set\ValueObject\SetList;

return static function (RectorConfig $rectorConfig): void {
    // Ziel-PHP-Version
    $rectorConfig->phpVersion(80200);

    // Sets, die mit Rector 1.x kompatibel sind
    $rectorConfig->sets([
        SetList::PHP_82,
        SetList::CODE_QUALITY,
        SetList::TYPE_DECLARATION,
    ]);

    // Projektpfade
    $rectorConfig->paths([
        __DIR__.'/lib',
        // __DIR__ . '/src',
        // __DIR__ . '/public',
    ]);

    // Skip-Patterns
    $rectorConfig->skip([
        __DIR__.'/src/Migrations/*',
        __DIR__.'/vendor',
        __DIR__.'/var',
        __DIR__.'/tests',
    ]);
};
