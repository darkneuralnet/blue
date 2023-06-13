.class public final synthetic Lvc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:Lyc0;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lyc0;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvc0;->a:Lyc0;

    iput-object p2, p0, Lvc0;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lvc0;->a:Lyc0;

    iget-object v1, p0, Lvc0;->b:Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lyc0;->a(Lyc0;Landroid/content/Context;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
