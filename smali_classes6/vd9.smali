.class public final synthetic Lvd9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lz26;


# direct methods
.method public synthetic constructor <init>(Lz26;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvd9;->a:Lz26;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;ILa09;)Lxk9;
    .locals 1

    iget-object v0, p0, Lvd9;->a:Lz26;

    check-cast p1, Lob8;

    invoke-virtual {v0, p1, p2, p3}, Lz26;->k(Lob8;ILa09;)Lxk9;

    move-result-object p1

    return-object p1
.end method
