PGDMP  1                    |            desktop    16.2    16.2 $               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    24586    desktop    DATABASE     ~   CREATE DATABASE desktop WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE desktop;
                postgres    false            �            1259    24587    Hospital    TABLE     $   CREATE TABLE public."Hospital" (
);
    DROP TABLE public."Hospital";
       public         heap    postgres    false            �            1259    24612    consulta    TABLE        CREATE TABLE public.consulta (
    id integer NOT NULL,
    paciente_id integer NOT NULL,
    medico_id integer NOT NULL,
    data_hora timestamp without time zone NOT NULL,
    cancelada boolean NOT NULL,
    motivo_cancelamento character varying(200)
);
    DROP TABLE public.consulta;
       public         heap    postgres    false            �            1259    24611    consulta_id_seq    SEQUENCE     �   CREATE SEQUENCE public.consulta_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.consulta_id_seq;
       public          postgres    false    221                       0    0    consulta_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.consulta_id_seq OWNED BY public.consulta.id;
          public          postgres    false    220            �            1259    24591    medico    TABLE     B  CREATE TABLE public.medico (
    id integer NOT NULL,
    nome character varying(100) NOT NULL,
    email character varying(100) NOT NULL,
    telefone character varying(20) NOT NULL,
    crm character varying(20) NOT NULL,
    especialidade character varying(50) NOT NULL,
    endereco character varying(200) NOT NULL
);
    DROP TABLE public.medico;
       public         heap    postgres    false            �            1259    24590    medico_id_seq    SEQUENCE     �   CREATE SEQUENCE public.medico_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.medico_id_seq;
       public          postgres    false    217                       0    0    medico_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.medico_id_seq OWNED BY public.medico.id;
          public          postgres    false    216            �            1259    24605    paciente    TABLE     .  CREATE TABLE public.paciente (
    id integer NOT NULL,
    nome character varying(100) NOT NULL,
    email character varying(100) NOT NULL,
    telefone character varying(20) NOT NULL,
    cpf character varying(14) NOT NULL,
    endereco character varying(200) NOT NULL,
    ativo boolean NOT NULL
);
    DROP TABLE public.paciente;
       public         heap    postgres    false            �            1259    24604    paciente_id_seq    SEQUENCE     �   CREATE SEQUENCE public.paciente_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.paciente_id_seq;
       public          postgres    false    219                       0    0    paciente_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.paciente_id_seq OWNED BY public.paciente.id;
          public          postgres    false    218            �            1259    24631    pessoas    TABLE     
  CREATE TABLE public.pessoas (
    id integer NOT NULL,
    nome character varying(100),
    email character varying(100),
    telefone character varying(20),
    cpf character varying(14),
    endereco character varying(255),
    ativo boolean,
    idade integer
);
    DROP TABLE public.pessoas;
       public         heap    postgres    false            �            1259    24630    pessoas_id_seq    SEQUENCE     �   CREATE SEQUENCE public.pessoas_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.pessoas_id_seq;
       public          postgres    false    223                       0    0    pessoas_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.pessoas_id_seq OWNED BY public.pessoas.id;
          public          postgres    false    222            e           2604    24615    consulta id    DEFAULT     j   ALTER TABLE ONLY public.consulta ALTER COLUMN id SET DEFAULT nextval('public.consulta_id_seq'::regclass);
 :   ALTER TABLE public.consulta ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    220    221    221            c           2604    24594 	   medico id    DEFAULT     f   ALTER TABLE ONLY public.medico ALTER COLUMN id SET DEFAULT nextval('public.medico_id_seq'::regclass);
 8   ALTER TABLE public.medico ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    217    216    217            d           2604    24608    paciente id    DEFAULT     j   ALTER TABLE ONLY public.paciente ALTER COLUMN id SET DEFAULT nextval('public.paciente_id_seq'::regclass);
 :   ALTER TABLE public.paciente ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    218    219    219            f           2604    24634 
   pessoas id    DEFAULT     h   ALTER TABLE ONLY public.pessoas ALTER COLUMN id SET DEFAULT nextval('public.pessoas_id_seq'::regclass);
 9   ALTER TABLE public.pessoas ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    222    223    223                       0    24587    Hospital 
   TABLE DATA           $   COPY public."Hospital"  FROM stdin;
    public          postgres    false    215   �'                 0    24612    consulta 
   TABLE DATA           i   COPY public.consulta (id, paciente_id, medico_id, data_hora, cancelada, motivo_cancelamento) FROM stdin;
    public          postgres    false    221   �'                 0    24591    medico 
   TABLE DATA           Y   COPY public.medico (id, nome, email, telefone, crm, especialidade, endereco) FROM stdin;
    public          postgres    false    217   �'                 0    24605    paciente 
   TABLE DATA           S   COPY public.paciente (id, nome, email, telefone, cpf, endereco, ativo) FROM stdin;
    public          postgres    false    219   �'                 0    24631    pessoas 
   TABLE DATA           Y   COPY public.pessoas (id, nome, email, telefone, cpf, endereco, ativo, idade) FROM stdin;
    public          postgres    false    223   (                  0    0    consulta_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.consulta_id_seq', 1, false);
          public          postgres    false    220                       0    0    medico_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.medico_id_seq', 1, false);
          public          postgres    false    216                       0    0    paciente_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.paciente_id_seq', 1, false);
          public          postgres    false    218                       0    0    pessoas_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.pessoas_id_seq', 1, false);
          public          postgres    false    222            l           2606    24617    consulta consulta_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.consulta
    ADD CONSTRAINT consulta_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.consulta DROP CONSTRAINT consulta_pkey;
       public            postgres    false    221            h           2606    24596    medico medico_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.medico
    ADD CONSTRAINT medico_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.medico DROP CONSTRAINT medico_pkey;
       public            postgres    false    217            j           2606    24610    paciente paciente_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.paciente
    ADD CONSTRAINT paciente_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.paciente DROP CONSTRAINT paciente_pkey;
       public            postgres    false    219            n           2606    24636    pessoas pessoas_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.pessoas
    ADD CONSTRAINT pessoas_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.pessoas DROP CONSTRAINT pessoas_pkey;
       public            postgres    false    223            o           2606    24623     consulta consulta_medico_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.consulta
    ADD CONSTRAINT consulta_medico_id_fkey FOREIGN KEY (medico_id) REFERENCES public.medico(id);
 J   ALTER TABLE ONLY public.consulta DROP CONSTRAINT consulta_medico_id_fkey;
       public          postgres    false    4712    221    217            p           2606    24618 "   consulta consulta_paciente_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.consulta
    ADD CONSTRAINT consulta_paciente_id_fkey FOREIGN KEY (paciente_id) REFERENCES public.paciente(id);
 L   ALTER TABLE ONLY public.consulta DROP CONSTRAINT consulta_paciente_id_fkey;
       public          postgres    false    219    221    4714                   x������ � �            x������ � �            x������ � �            x������ � �            x������ � �     