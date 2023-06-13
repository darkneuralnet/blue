.class public Lorg/apache/commons/math3/exception/MathIllegalNumberException;
.super Lorg/apache/commons/math3/exception/MathIllegalArgumentException;
.source "SourceFile"


# static fields
.field public static final d:Ljava/lang/Integer;

.field private static final serialVersionUID:J = -0x67595d29f3bbad06L


# instance fields
.field public final c:Ljava/lang/Number;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/math3/exception/MathIllegalNumberException;->d:Ljava/lang/Integer;

    return-void
.end method

.method public varargs constructor <init>(LHv2;Ljava/lang/Number;[Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 v1, 0x1

    aput-object p3, v0, v1

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/math3/exception/MathIllegalArgumentException;-><init>(LHv2;[Ljava/lang/Object;)V

    iput-object p2, p0, Lorg/apache/commons/math3/exception/MathIllegalNumberException;->c:Ljava/lang/Number;

    return-void
.end method
