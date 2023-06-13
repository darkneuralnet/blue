.class public Lm10$d;
.super Lgz5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm10;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lm10;


# direct methods
.method public constructor <init>(Lm10;LEb5;)V
    .locals 0

    iput-object p1, p0, Lm10$d;->d:Lm10;

    invoke-direct {p0, p2}, Lgz5;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE brain_swaps SET status = ? WHERE imei = ?"

    return-object v0
.end method
