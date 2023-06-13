.class public Lzendesk/core/SettingsPack;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E::",
        "Lzendesk/core/Settings;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private coreSettings:Lzendesk/core/CoreSettings;

.field private settings:Lzendesk/core/Settings;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzendesk/core/CoreSettings;Lzendesk/core/Settings;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/core/CoreSettings;",
            "TE;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/SettingsPack;->coreSettings:Lzendesk/core/CoreSettings;

    iput-object p2, p0, Lzendesk/core/SettingsPack;->settings:Lzendesk/core/Settings;

    return-void
.end method


# virtual methods
.method public getCoreSettings()Lzendesk/core/CoreSettings;
    .locals 1

    iget-object v0, p0, Lzendesk/core/SettingsPack;->coreSettings:Lzendesk/core/CoreSettings;

    return-object v0
.end method

.method public getSettings()Lzendesk/core/Settings;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/core/SettingsPack;->settings:Lzendesk/core/Settings;

    return-object v0
.end method
