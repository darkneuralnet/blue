.class final Lcom/stripe/android/financialconnections/ui/components/TextKt$AnnotatedText$resource$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/ui/components/TextKt;->AnnotatedText(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;LG26;LgV2;Ljava/util/Map;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/text/Annotation;",
        "LGN5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\ncom/stripe/android/financialconnections/ui/components/TextKt$AnnotatedText$resource$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,144:1\n1282#2,2:145\n*S KotlinDebug\n*F\n+ 1 Text.kt\ncom/stripe/android/financialconnections/ui/components/TextKt$AnnotatedText$resource$1\n*L\n48#1:145,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $annotationStyles:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;",
            "LGN5;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $pressedAnnotation$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $pressedColor:J


# direct methods
.method public constructor <init>(Ljava/util/Map;JLEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;",
            "LGN5;",
            ">;J",
            "LEX2<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/components/TextKt$AnnotatedText$resource$1;->$annotationStyles:Ljava/util/Map;

    iput-wide p2, p0, Lcom/stripe/android/financialconnections/ui/components/TextKt$AnnotatedText$resource$1;->$pressedColor:J

    iput-object p4, p0, Lcom/stripe/android/financialconnections/ui/components/TextKt$AnnotatedText$resource$1;->$pressedAnnotation$delegate:LEX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroid/text/Annotation;)LGN5;
    .locals 27

    move-object/from16 v0, p0

    const-string v1, "annotation"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;->values()[Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x0

    if-ge v4, v3, :cond_1

    aget-object v6, v1, v4

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;->getValue()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Landroid/text/Annotation;->getKey()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move-object v6, v5

    :goto_1
    iget-object v1, v0, Lcom/stripe/android/financialconnections/ui/components/TextKt$AnnotatedText$resource$1;->$annotationStyles:Ljava/util/Map;

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, LGN5;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/ui/components/TextKt$AnnotatedText$resource$1;->$pressedAnnotation$delegate:LEX2;

    invoke-static {v1}, Lcom/stripe/android/financialconnections/ui/components/TextKt;->access$AnnotatedText$lambda$1(LEX2;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Landroid/text/Annotation;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v6, :cond_3

    iget-wide v7, v0, Lcom/stripe/android/financialconnections/ui/components/TextKt$AnnotatedText$resource$1;->$pressedColor:J

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x3ffe

    const/16 v26, 0x0

    invoke-static/range {v6 .. v26}, LGN5;->b(LGN5;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILjava/lang/Object;)LGN5;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v6

    :cond_3
    :goto_2
    return-object v5
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/text/Annotation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/ui/components/TextKt$AnnotatedText$resource$1;->invoke(Landroid/text/Annotation;)LGN5;

    move-result-object p1

    return-object p1
.end method
