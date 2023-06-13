.class public LNq0$o;
.super Lgz5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNq0;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:LNq0;


# direct methods
.method public constructor <init>(LNq0;LEb5;)V
    .locals 0

    iput-object p1, p0, LNq0$o;->d:LNq0;

    invoke-direct {p0, p2}, Lgz5;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE complaint_resolution SET submitted = 1 WHERE complaint_hash = ?"

    return-object v0
.end method
