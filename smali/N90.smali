.class public final synthetic LN90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:LP90$a;


# direct methods
.method public synthetic constructor <init>(LP90$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN90;->a:LP90$a;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN90;->a:LP90$a;

    invoke-static {v0, p1}, LP90$a;->d(LP90$a;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
