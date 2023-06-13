.class public LmH1$c;
.super Lgz5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmH1;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:LmH1;


# direct methods
.method public constructor <init>(LmH1;LEb5;)V
    .locals 0

    iput-object p1, p0, LmH1$c;->d:LmH1;

    invoke-direct {p0, p2}, Lgz5;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM hard_count_scan WHERE session_id != ?"

    return-object v0
.end method
