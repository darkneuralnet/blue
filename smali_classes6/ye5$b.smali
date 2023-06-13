.class public Lye5$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpx2$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lye5;->n(Lye5$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lye5$c;


# direct methods
.method public constructor <init>(Lye5$c;)V
    .locals 0

    iput-object p1, p0, Lye5$b;->a:Lye5$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lye5$b;->a:Lye5$c;

    invoke-interface {v0, p1, p2, p3}, Lye5$c;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
