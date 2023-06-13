.class public LQ24$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ24;->F(LrN5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "LrN5;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LQ24;


# direct methods
.method public constructor <init>(LQ24;)V
    .locals 0

    iput-object p1, p0, LQ24$a;->b:LQ24;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LrN5;LrN5;)I
    .locals 0

    iget p1, p1, LrN5;->d:I

    iget p2, p2, LrN5;->d:I

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LrN5;

    check-cast p2, LrN5;

    invoke-virtual {p0, p1, p2}, LQ24$a;->a(LrN5;LrN5;)I

    move-result p1

    return p1
.end method
