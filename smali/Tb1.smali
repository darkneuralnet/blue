.class public final synthetic LTb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:LOb1$d;


# direct methods
.method public synthetic constructor <init>(LOb1$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTb1;->a:LOb1$d;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LTb1;->a:LOb1$d;

    invoke-static {v0, p1}, LOb1$d;->j(LOb1$d;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
