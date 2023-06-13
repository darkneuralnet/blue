.class public LDX4$c;
.super Lgz5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDX4;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:LDX4;


# direct methods
.method public constructor <init>(LDX4;LEb5;)V
    .locals 0

    iput-object p1, p0, LDX4$c;->d:LDX4;

    invoke-direct {p0, p2}, Lgz5;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE ride_pass_view SET status = \'active\' WHERE link_code = ?"

    return-object v0
.end method
