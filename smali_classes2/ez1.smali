.class public final Lez1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldz1;


# instance fields
.field public final a:Lfz1;


# direct methods
.method public constructor <init>(Lfz1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lez1;->a:Lfz1;

    return-void
.end method

.method public static b(Lfz1;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfz1;",
            ")",
            "LY94<",
            "Ldz1;",
            ">;"
        }
    .end annotation

    new-instance v0, Lez1;

    invoke-direct {v0, p0}, Lez1;-><init>(Lfz1;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LH31;Lco/bird/android/core/mvp/BaseActivity;)Lcz1;
    .locals 1

    iget-object v0, p0, Lez1;->a:Lfz1;

    invoke-virtual {v0, p1, p2}, Lfz1;->b(LH31;Lco/bird/android/core/mvp/BaseActivity;)Lcz1;

    move-result-object p1

    return-object p1
.end method
