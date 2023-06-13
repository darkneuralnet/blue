.class public Lgp1$b;
.super Lgz5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgp1;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lgp1;


# direct methods
.method public constructor <init>(Lgp1;LEb5;)V
    .locals 0

    iput-object p1, p0, Lgp1$b;->d:Lgp1;

    invoke-direct {p0, p2}, Lgz5;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM fleet_list_vehicle"

    return-object v0
.end method
