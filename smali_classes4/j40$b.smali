.class public Lj40$b;
.super Lgz5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj40;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lj40;


# direct methods
.method public constructor <init>(Lj40;LEb5;)V
    .locals 0

    iput-object p1, p0, Lj40$b;->d:Lj40;

    invoke-direct {p0, p2}, Lgz5;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM bulk_scan_purpose_bird WHERE purpose = ?"

    return-object v0
.end method
