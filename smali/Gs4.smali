.class public final synthetic LGs4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:LHs4;

.field public final synthetic b:LHs4$i;


# direct methods
.method public synthetic constructor <init>(LHs4;LHs4$i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGs4;->a:LHs4;

    iput-object p2, p0, LGs4;->b:LHs4$i;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LGs4;->a:LHs4;

    iget-object v1, p0, LGs4;->b:LHs4$i;

    invoke-static {v0, v1, p1}, LHs4;->i(LHs4;LHs4$i;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
