.class public LLr2$b;
.super Lxo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLr2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic g:LLr2;


# direct methods
.method public constructor <init>(LLr2;Lb80;)V
    .locals 0

    iput-object p1, p0, LLr2$b;->g:LLr2;

    invoke-direct {p0}, Lxo;-><init>()V

    new-instance p1, LsN5;

    invoke-direct {p1, p0, p2}, LsN5;-><init>(Lxo;Lb80;)V

    iput-object p1, p0, Lxo;->e:Lxo$a;

    return-void
.end method
