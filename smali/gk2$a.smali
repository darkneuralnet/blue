.class public Lgk2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgk2;->g(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lgk2$c;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lgk2;


# direct methods
.method public constructor <init>(Lgk2;)V
    .locals 0

    iput-object p1, p0, Lgk2$a;->b:Lgk2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgk2$c;Lgk2$c;)I
    .locals 0

    iget p1, p1, Lgk2$c;->a:I

    iget p2, p2, Lgk2$c;->a:I

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lgk2$c;

    check-cast p2, Lgk2$c;

    invoke-virtual {p0, p1, p2}, Lgk2$a;->a(Lgk2$c;Lgk2$c;)I

    move-result p1

    return p1
.end method
