package com.behcet.wordbookai.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = LightPrimary, // status/success, level/learning
    onPrimary = LightOnPrimary,
    primaryContainer = LightCard,
    onPrimaryContainer = LightTextPrimary,
    secondary = LightStatusWarning, // status/warning
    onSecondary = Color.White,
    secondaryContainer = LightCard,
    onSecondaryContainer = LightTextPrimary,
    tertiary = LightStatusRetry, // status/retry
    onTertiary = Color.White,
    background = LightBackground,
    onBackground = LightTextPrimary,
    surface = LightSurface,
    onSurface = LightTextPrimary, // level/learned
    surfaceVariant = LightCard,
    onSurfaceVariant = LightTextSecondary,
    surfaceTint = LightPrimary,
    surfaceContainerLowest = LightSurface,
    surfaceContainerLow = LightSurface,
    surfaceContainer = LightCard,
    surfaceContainerHigh = LightCard,
    surfaceContainerHighest = LightCard,
    outline = LightOutline, // level/new
    outlineVariant = LightCard,
    error = LightStatusError, // status/error
    onError = Color.White,
)

private val DarkColorScheme = darkColorScheme(
    primary = DarkPrimary, // status/success, level/learning
    onPrimary = DarkOnPrimary,
    primaryContainer = DarkCard,
    onPrimaryContainer = DarkTextPrimary,
    secondary = DarkStatusWarning, // status/warning
    onSecondary = DarkBackground,
    secondaryContainer = DarkCard,
    onSecondaryContainer = DarkTextPrimary,
    tertiary = DarkStatusRetry, // status/retry
    onTertiary = DarkBackground,
    background = DarkBackground,
    onBackground = DarkTextPrimary,
    surface = DarkSurface,
    onSurface = DarkTextPrimary, // level/learned
    surfaceVariant = DarkCard,
    onSurfaceVariant = DarkTextSecondary,
    surfaceTint = DarkPrimary,
    surfaceContainerLowest = DarkBackground,
    surfaceContainerLow = DarkSurface,
    surfaceContainer = DarkCard,
    surfaceContainerHigh = DarkCard,
    surfaceContainerHighest = DarkCard,
    outline = DarkOutline, // level/new
    outlineVariant = DarkCard,
    error = DarkStatusError, // status/error
    onError = Color(0xFF601410),
)

@Composable
fun WordbookAITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
