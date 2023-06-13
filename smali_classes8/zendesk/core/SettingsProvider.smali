.class public interface abstract Lzendesk/core/SettingsProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getCoreSettings(LlI6;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlI6<",
            "Lzendesk/core/CoreSettings;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract getSettingsForSdk(Ljava/lang/String;Ljava/lang/Class;LlI6;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lzendesk/core/Settings;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TE;>;",
            "LlI6<",
            "Lzendesk/core/SettingsPack<",
            "TE;>;>;)V"
        }
    .end annotation
.end method
