.class public Lxq1$b;
.super Lgz5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxq1;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lxq1;


# direct methods
.method public constructor <init>(Lxq1;LEb5;)V
    .locals 0

    iput-object p1, p0, Lxq1$b;->d:Lxq1;

    invoke-direct {p0, p2}, Lgz5;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM fleet_status WHERE fleet_id = ? AND created_at < ?"

    return-object v0
.end method
