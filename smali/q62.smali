.class public final synthetic Lq62;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:Ls62;

.field public final synthetic b:LHX1$a;


# direct methods
.method public synthetic constructor <init>(Ls62;LHX1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq62;->a:Ls62;

    iput-object p2, p0, Lq62;->b:LHX1$a;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lq62;->a:Ls62;

    iget-object v1, p0, Lq62;->b:LHX1$a;

    invoke-static {v0, v1, p1}, Ls62;->b(Ls62;LHX1$a;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
