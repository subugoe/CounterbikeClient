<?php

declare(strict_types=1);

use Rector\Core\Configuration\Option;
use Rector\Set\ValueObject\SetList;
use Rector\Symfony\Set\SymfonySetList;
use Symfony\Component\DependencyInjection\Loader\Configurator\ContainerConfigurator;

return static function (ContainerConfigurator $containerConfigurator): void {
    $parameters = $containerConfigurator->parameters();

    $parameters->set(Option::IMPORT_SHORT_CLASSES, false);

    $parameters->set(Option::SETS, [
        SetList::CODE_QUALITY,
        SetList::PHP_74,
        SetList::TYPE_DECLARATION
    ]);

    $parameters->set(Option::SKIP, [
        '*/vendor/*',
        '*/tests/*',
        '*/var/*',
        '*/public/*',
        '*/config/*',
    ]);
};
