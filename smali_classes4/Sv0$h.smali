.class public LSv0$h;
.super Lgz5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSv0;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:LSv0;


# direct methods
.method public constructor <init>(LSv0;LEb5;)V
    .locals 0

    iput-object p1, p0, LSv0$h;->d:LSv0;

    invoke-direct {p0, p2}, Lgz5;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE configurable_tutorial SET seen_count = seen_count + 1 WHERE id = ?"

    return-object v0
.end method
