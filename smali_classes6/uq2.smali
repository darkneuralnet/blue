.class public final synthetic Luq2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUs0;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lvq2$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lvq2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luq2;->a:Ljava/lang/String;

    iput-object p2, p0, Luq2;->b:Lvq2$a;

    return-void
.end method


# virtual methods
.method public final a(LOs0;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Luq2;->a:Ljava/lang/String;

    iget-object v1, p0, Luq2;->b:Lvq2$a;

    invoke-static {v0, v1, p1}, Lvq2;->a(Ljava/lang/String;Lvq2$a;LOs0;)Ltq2;

    move-result-object p1

    return-object p1
.end method
