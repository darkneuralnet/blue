.class public LY06$e;
.super LY06$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY06;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final b:Z


# direct methods
.method public constructor <init>(LY06$c;Z)V
    .locals 0

    invoke-direct {p0, p1}, LY06$d;-><init>(LY06$c;)V

    iput-boolean p2, p0, LY06$e;->b:Z

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, LY06$e;->b:Z

    return v0
.end method
