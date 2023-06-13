.class public LEI6$l;
.super Lgz5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEI6;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:LEI6;


# direct methods
.method public constructor <init>(LEI6;LEb5;)V
    .locals 0

    iput-object p1, p0, LEI6$l;->d:LEI6;

    invoke-direct {p0, p2}, Lgz5;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM zone_regions WHERE region_updated_at < ?"

    return-object v0
.end method
